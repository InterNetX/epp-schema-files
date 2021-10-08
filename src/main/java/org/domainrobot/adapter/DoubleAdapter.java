package org.domainrobot.adapter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DoubleAdapter extends XmlAdapter<String, Double> {

	private static final NumberFormat df = synchronizedNumberFormat(
		new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH)));

	@Override
	public Double unmarshal(String v) throws ParseException {
		if(v == null || v.isEmpty())
			return null;
		return (Double) df.parse(v).doubleValue();
	}

	@Override
	public String marshal(Double v) {
		if(v != null) {
			return df.format(v);
		}
		return null;
	}

	public static NumberFormat synchronizedNumberFormat(final NumberFormat nf) {
		return new NumberFormat() {

			private static final long serialVersionUID = 1L;

			private final Object lock = new Object();

			@Override
			public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) {
				StringBuffer sb = null;
				synchronized(lock) {
					sb = nf.format(number, toAppendTo, pos);
				}
				return sb;
			}

			@Override
			public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) {
				StringBuffer sb = null;
				synchronized(lock) {
					sb = nf.format(number, toAppendTo, pos);
				}
				return sb;
			}

			@Override
			public Number parse(String source, ParsePosition parsePosition) {
				Number result = null;
				synchronized(lock) {
					result = nf.parse(source, parsePosition);
				}
				return result;
			}

		};

	}
}
