/**
 *
 */
package de.hybris.practice.facades.customer;

import de.hybris.platform.commercefacades.customer.CustomerFacade;

import org.springframework.web.multipart.MultipartFile;


public interface EmailTaskCustomerFacade extends CustomerFacade
{
	public void sendEmailWithAttachment(MultipartFile file);



}
