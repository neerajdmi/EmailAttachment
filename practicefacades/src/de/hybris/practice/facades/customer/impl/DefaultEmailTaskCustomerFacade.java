
package de.hybris.practice.facades.customer.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.practice.facades.customer.EmailTaskCustomerFacade;
import de.hybris.practice.facades.events.SendEmailEvent;

import org.springframework.web.multipart.MultipartFile;


public class DefaultEmailTaskCustomerFacade extends DefaultCustomerFacade implements EmailTaskCustomerFacade
{



	@Override
	public void sendEmailWithAttachment(final MultipartFile file)
	{
		final CustomerModel currentCustomer = (CustomerModel) getUserService().getCurrentUser();
		final SendEmailEvent sendEmail = new SendEmailEvent();
		sendEmail.setCustomer(currentCustomer);
		sendEmail.setSite(getBaseSiteService().getCurrentBaseSite());
		sendEmail.setFile(file);
		getEventService().publishEvent(sendEmail);

	}


}
