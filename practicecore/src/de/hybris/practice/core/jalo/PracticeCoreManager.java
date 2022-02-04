/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.practice.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.practice.core.constants.PracticeCoreConstants;
import de.hybris.practice.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class PracticeCoreManager extends GeneratedPracticeCoreManager
{
	public static final PracticeCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (PracticeCoreManager) em.getExtension(PracticeCoreConstants.EXTENSIONNAME);
	}
}
