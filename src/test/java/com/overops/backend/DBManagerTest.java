/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.overops.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class DBManagerTest {
	@Before
    public void init() {
    	try {
	    	DBManager dbManager = new DBManager();
			assertEquals(true, dbManager.connect(""), "Invalid connection string");
    	} catch (Exception e) {
    		
    	}
    	
    	try {
			Thread.sleep(10000);
		} catch (Exception e) { }
    }
    
	@Test
	@DisplayName("My 1st JUnit 5 test! 😎")
	void testEmptyConnection(TestInfo testInfo) {
		try {
			Thread.sleep(5000);
		} catch (Exception e) { }
		
		
		DBManager dbManager = new DBManager();
		assertEquals(true, dbManager.connect(""), "Invalid connection string");
	}

	@Test
	@DisplayName("My 2st JUnit 5 test! 😎")
	void testInvalidConnetion(TestInfo testInfo) {
		try {
			Thread.sleep(5000);
		} catch (Exception e) { }
		
		DBManager dbManager = new DBManager();
		assertEquals(true, dbManager.connect("invalid"), "Invalid connection string");
	}
}
