/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.eeiwdey.train.ejb.convertor;

import java.math.BigDecimal;

import javax.ejb.EJB;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.eeiwdey.train.ejb.converter.ConverterBean;

@RunWith(CdiTestRunner.class)
public class ConverterBeanTest {

	@EJB
	private ConverterBean converterBean;
	
	@Test
	public void dollarToYen_coversionRateSetByPostConstruct_success() {
		final BigDecimal dollar = new BigDecimal(10);
		final BigDecimal result = converterBean.dollarToYen(dollar);
		assertTrue(result.intValue() == 830);
	}
}
