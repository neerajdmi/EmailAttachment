/**
 *
 */
package de.hybris.practice.core.event;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.commerceservices.model.process.StoreFrontProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.practice.facades.events.SendEmailEvent;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SendEmailEventListner extends AbstractEventListener<SendEmailEvent>
{
	private EmailService emailService;
	private ModelService modelService;
	private BusinessProcessService businessProcessService;

	@Override
	protected void onEvent(final SendEmailEvent event)
	{
		final StoreFrontProcessModel storeFrontProcessModel = (StoreFrontProcessModel) getBusinessProcessService().createProcess(
				"sendAttachmentEmailProcess" + event.getCustomer().getUid() + "-" + System.currentTimeMillis(),
				"sendAttachmentEmailProcess");

		storeFrontProcessModel.setSite(event.getSite());
		storeFrontProcessModel.setUser(event.getCustomer());


		DataInputStream inputStream = null;
		try
		{
			inputStream = new DataInputStream(event.getFile().getInputStream());
		}
		catch (final IOException e)
		{
			e.printStackTrace();
		}


		final EmailAttachmentModel attachment = getEmailService().createEmailAttachment(inputStream,
				event.getFile().getOriginalFilename(), event.getFile().getContentType());
		final List<EmailAttachmentModel> attachments = new ArrayList();
		attachments.add(attachment);

		storeFrontProcessModel.setAttachments(attachments);
		getModelService().save(storeFrontProcessModel);
		getBusinessProcessService().startProcess(storeFrontProcessModel);
	}



	/**
	 * @return the emailService
	 */
	public EmailService getEmailService()
	{
		return emailService;
	}


	/**
	 * @param emailService
	 *           the emailService to set
	 */
	public void setEmailService(final EmailService emailService)
	{
		this.emailService = emailService;
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


	/**
	 * @return the businessProcessService
	 */
	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}


	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

}
