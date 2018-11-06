package org.domainrobot.adapter;

import java.util.Currency;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 * @author thomasproll
 * @copyright Copyright (C) 2018 InterNetX GmbH. All rights reserved.
 * @license MIT license; see LICENSE
 */
public class CurrencyAdapter extends XmlAdapter<String, Currency> {

	@Override
	public Currency unmarshal(String v) {
		if(v == null || v.isEmpty())
			return null;
		return Currency.getInstance(v);
	}

	@Override
	public String marshal(Currency v) {
		if(v != null) {
			return v.getCurrencyCode();
		}
		return null;
	}

}
