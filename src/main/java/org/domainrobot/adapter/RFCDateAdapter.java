package org.domainrobot.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
/**
 * 
 * @author thomasproll
 * @copyright Copyright (C) 2017 InterNetX GmbH. All rights reserved.
 * @license MIT license; see LICENSE
 */
public class RFCDateAdapter extends XmlAdapter<String, Date> {

	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	private final Object lock = new Object();

	@Override
	public Date unmarshal(String v) throws Exception {
		synchronized(lock) {
			return df.parse(v);
		}
	}

	@Override
	public String marshal(Date v) throws Exception {
		synchronized(lock) {
			return df.format(v);
		}
	}

}
