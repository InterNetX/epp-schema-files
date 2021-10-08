package org.domainrobot.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 * @author thomasproll
 * @copyright Copyright (C) 2017 InterNetX GmbH. All rights reserved.
 * @license MIT license; see LICENSE
 */
public class RFCDateTimeAdapter extends XmlAdapter<String, Date> {

	private final DateFormat df;

	private final Object lock = new Object();

	public RFCDateTimeAdapter() {
		df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	@Override
	public Date unmarshal(String v) throws Exception {
		if(v == null || v.length() == 0)
			return null;
		synchronized(lock) {
			return df.parse(v);
		}
	}

	@Override
	public String marshal(Date v) throws Exception {
		if(v == null)
			return null;
		synchronized(lock) {
			return df.format(v);
		}
	}

}
