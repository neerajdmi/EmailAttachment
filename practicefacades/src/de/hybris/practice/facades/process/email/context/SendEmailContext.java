package de.hybris.practice.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.model.process.StoreFrontProcessModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;

import org.springframework.beans.factory.annotation.Autowired;

public class SendEmailContext extends AbstractEmailContext<StoreFrontProcessModel>
{
	@Autowired
	private CustomerModel customer;
	private static final String CUSTOMER_NAME = "customerName";
	private static final String CUSTOMER_EMAIL = "customerEmail";
	@Override
	public void init(final StoreFrontProcessModel processModel, final EmailPageModel emailPageModel)
	{
		super.init(processModel, emailPageModel);
		final CustomerModel customer = getCustomer(processModel);
		put(CUSTOMER_NAME, customer.getName());
		put(CUSTOMER_EMAIL, customer.getUid());
	}

	@Override
	protected BaseSiteModel getSite(final StoreFrontProcessModel businessProcessModel)
	{
		return businessProcessModel.getSite();
	}

	@Override
	protected CustomerModel getCustomer(final StoreFrontProcessModel businessProcessModel)
	{
		return (CustomerModel) businessProcessModel.getUser();
	}

	@Override
	protected LanguageModel getEmailLanguage(final StoreFrontProcessModel businessProcessModel)
	{
		return businessProcessModel.getUser().getSessionLanguage();
	}

}
