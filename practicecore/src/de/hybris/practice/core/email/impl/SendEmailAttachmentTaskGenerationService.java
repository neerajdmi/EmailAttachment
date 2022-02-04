/**
 *
 */
package de.hybris.practice.core.email.impl;

import de.hybris.platform.acceleratorservices.email.impl.DefaultEmailGenerationService;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.practice.core.email.SendEmailTaskGenerationService;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Neeraj
 *
 */
public class SendEmailAttachmentTaskGenerationService extends DefaultEmailGenerationService
		implements SendEmailTaskGenerationService
{
	@Autowired
	private ModelService modelService;



	private static final Logger LOG = Logger.getLogger(SendEmailAttachmentTaskGenerationService.class);



	@Override
	public EmailMessageModel generate(final BusinessProcessModel businessProcessModel, final EmailPageModel emailPageModel)
	{
		final EmailMessageModel emailMessage = super.generate(businessProcessModel, emailPageModel);




		final List<EmailAttachmentModel> emailattachments = businessProcessModel.getAttachments();
		emailMessage.setAttachments(emailattachments);
		getModelService().saveAll(emailMessage);



		return emailMessage;



	}



	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}



	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
