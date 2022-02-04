/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Feb-2022, 9:05:59 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cronjob.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.practice.core.constants.PracticeCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.ProductsRemovalCronJob ProductsRemovalCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductsRemovalCronJob extends CronJob
{
	/** Qualifier of the <code>ProductsRemovalCronJob.price</code> attribute **/
	public static final String PRICE = "price";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductsRemovalCronJob.price</code> attribute.
	 * @return the price - All Products whose price is below 100$ will be removed
	 */
	public Integer getPrice(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductsRemovalCronJob.price</code> attribute.
	 * @return the price - All Products whose price is below 100$ will be removed
	 */
	public Integer getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @return the price - All Products whose price is below 100$ will be removed
	 */
	public int getPriceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPrice( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @return the price - All Products whose price is below 100$ will be removed
	 */
	public int getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @param value the price - All Products whose price is below 100$ will be removed
	 */
	public void setPrice(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @param value the price - All Products whose price is below 100$ will be removed
	 */
	public void setPrice(final Integer value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @param value the price - All Products whose price is below 100$ will be removed
	 */
	public void setPrice(final SessionContext ctx, final int value)
	{
		setPrice( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductsRemovalCronJob.price</code> attribute. 
	 * @param value the price - All Products whose price is below 100$ will be removed
	 */
	public void setPrice(final int value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
}
