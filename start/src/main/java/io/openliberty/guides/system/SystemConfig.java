// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
package io.openliberty.guides.system;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.inject.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
//import io.openliberty.guides.config.Email;

@RequestScoped
public class SystemConfig {

  @Inject
  @ConfigProperty(name = "io_openliberty_guides_system_inMaintenance")
  Provider<Boolean> inMaintenance;

  public boolean isInMaintenance() {
    System.out.println("GRACE LOOK HERE:" +inMaintenance.get());
    return inMaintenance.get();
  }

}
