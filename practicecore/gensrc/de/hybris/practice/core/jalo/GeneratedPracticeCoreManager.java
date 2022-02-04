/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Feb-2022, 9:05:59 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.practice.core.jalo;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment;
import de.hybris.platform.cronjob.jalo.ProductsRemovalCronJob;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.practice.core.constants.PracticeCoreConstants;
import de.hybris.practice.core.jalo.ApparelProduct;
import de.hybris.practice.core.jalo.ApparelSizeVariantProduct;
import de.hybris.practice.core.jalo.ApparelStyleVariantProduct;
import de.hybris.practice.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.practice.core.jalo.process.EmailWithAttachment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>PracticeCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPracticeCoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n ATTACHMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailAttachment> BUSINESSPROCESS2EMAILATTACHMENTSRELATTACHMENTSHANDLER = new OneToManyHandler<EmailAttachment>(
	AcceleratorServicesConstants.TC.EMAILATTACHMENT,
	true,
	"process",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("process", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.attachments</code> attribute.
	 * @return the attachments
	 */
	public List<EmailAttachment> getAttachments(final SessionContext ctx, final BusinessProcess item)
	{
		return (List<EmailAttachment>)BUSINESSPROCESS2EMAILATTACHMENTSRELATTACHMENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.attachments</code> attribute.
	 * @return the attachments
	 */
	public List<EmailAttachment> getAttachments(final BusinessProcess item)
	{
		return getAttachments( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.attachments</code> attribute. 
	 * @param value the attachments
	 */
	public void setAttachments(final SessionContext ctx, final BusinessProcess item, final List<EmailAttachment> value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTSRELATTACHMENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.attachments</code> attribute. 
	 * @param value the attachments
	 */
	public void setAttachments(final BusinessProcess item, final List<EmailAttachment> value)
	{
		setAttachments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachments. 
	 * @param value the item to add to attachments
	 */
	public void addToAttachments(final SessionContext ctx, final BusinessProcess item, final EmailAttachment value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTSRELATTACHMENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attachments. 
	 * @param value the item to add to attachments
	 */
	public void addToAttachments(final BusinessProcess item, final EmailAttachment value)
	{
		addToAttachments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachments. 
	 * @param value the item to remove from attachments
	 */
	public void removeFromAttachments(final SessionContext ctx, final BusinessProcess item, final EmailAttachment value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTSRELATTACHMENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attachments. 
	 * @param value the item to remove from attachments
	 */
	public void removeFromAttachments(final BusinessProcess item, final EmailAttachment value)
	{
		removeFromAttachments( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public EmailWithAttachment createEmailWithAttachment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.EMAILWITHATTACHMENT );
			return (EmailWithAttachment)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating EmailWithAttachment : "+e.getMessage(), 0 );
		}
	}
	
	public EmailWithAttachment createEmailWithAttachment(final Map attributeValues)
	{
		return createEmailWithAttachment( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductsRemovalCronJob createProductsRemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PracticeCoreConstants.TC.PRODUCTSREMOVALCRONJOB );
			return (ProductsRemovalCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductsRemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public ProductsRemovalCronJob createProductsRemovalCronJob(final Map attributeValues)
	{
		return createProductsRemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return PracticeCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.process</code> attribute.
	 * @return the process
	 */
	public BusinessProcess getProcess(final SessionContext ctx, final EmailAttachment item)
	{
		return (BusinessProcess)item.getProperty( ctx, PracticeCoreConstants.Attributes.EmailAttachment.PROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.process</code> attribute.
	 * @return the process
	 */
	public BusinessProcess getProcess(final EmailAttachment item)
	{
		return getProcess( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final SessionContext ctx, final EmailAttachment item, final BusinessProcess value)
	{
		item.setProperty(ctx, PracticeCoreConstants.Attributes.EmailAttachment.PROCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final EmailAttachment item, final BusinessProcess value)
	{
		setProcess( getSession().getSessionContext(), item, value );
	}
	
}
