package org.domainrobot.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 * @author thomasproll
 * @copyright Copyright (C) 2017 InterNetX GmbH. All rights reserved.
 * @license MIT license; see LICENSE
 */
public class BooleanAdapter extends XmlAdapter<String, Boolean> {

	@Override
	public Boolean unmarshal(String v) {
		if(v == null || v.isEmpty())
			return null;
		if(v.equals("1") || v.equalsIgnoreCase("true"))
			return Boolean.TRUE;
		return Boolean.FALSE;
	}

	@Override
	public String marshal(Boolean v) {
		if(v != null) {
			return v ? "1" : "0";
		}
		return null;
	}

}
