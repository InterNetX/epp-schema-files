package org.domainrobot.adapter;

import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;
/**
 * 
 * @author thomasproll
 * @copyright Copyright (C) 2017 InterNetX GmbH. All rights reserved.
 * @license MIT license; see LICENSE
 */
public class LocaleLanguageAdapter extends XmlAdapter<String, Locale> {

	@Override
	public Locale unmarshal(String v) {
		if(v == null || v.length() == 0)
			return null;
		String[] locParts = v.split("_");
		if(locParts.length == 1)
			return new Locale(locParts[0]);
		else if(locParts.length == 2)
			return new Locale(locParts[0], locParts[1]);
		else if(locParts.length == 3)
			return new Locale(locParts[0], locParts[1], locParts[2]);
		throw new IllegalArgumentException("Unexpected langauga string " + v);
	}

	@Override
	public String marshal(Locale v) throws Exception {
		return v != null ? v.toString() : null;
	}

}
