/**
 *
 */
package de.hybris.practice.core.products.remove.cronjob;


import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.ProductsRemovalCronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.practice.core.suggestion.dao.impl.DefaultSimpleSuggestionDao;

import java.util.List;

import org.apache.log4j.Logger;



public class ProductsRemovalJob extends AbstractJobPerformable<ProductsRemovalCronJobModel>
{
	private DefaultSimpleSuggestionDao defaultSimpleSuggestionDao;
	private static final Logger LOG = Logger.getLogger(ProductsRemovalJob.class);

	@Override
	public PerformResult perform(final ProductsRemovalCronJobModel cronJobModel)
	{
		final String currency = cronJobModel.getSessionCurrency().getIsocode();

		final int price = cronJobModel.getPrice();
		//final List<ProductModel> productModelListToBeDeleted = new ArrayList<>();
		final List<ProductModel> productModelList = defaultSimpleSuggestionDao.getProducts(price, currency);
		//final String unapproved = articleApprovalStatus.UNAPPROVED;
		for (final ProductModel productModel : productModelList)
		{

			productModel.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			modelService.save(productModel);
			LOG.info(productModel);

		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	/**
	 * @return the defaultSimpleSuggestionDao
	 */
	public DefaultSimpleSuggestionDao getDefaultSimpleSuggestionDao()
	{
		return defaultSimpleSuggestionDao;
	}

	/**
	 * @param defaultSimpleSuggestionDao the defaultSimpleSuggestionDao to set
	 */
	public void setDefaultSimpleSuggestionDao(DefaultSimpleSuggestionDao defaultSimpleSuggestionDao)
	{
		this.defaultSimpleSuggestionDao = defaultSimpleSuggestionDao;
	}

	/**
	 * @return the log
	 */
	public static Logger getLog()
	{
		return LOG;
	}



}
