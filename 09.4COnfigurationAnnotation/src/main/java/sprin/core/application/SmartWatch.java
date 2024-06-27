package sprin.core.application;

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

public class SmartWatch {

	@Override
	public String toString() {
		return "SmartWatch [w=" + w + "]";
	}

	@Autowired
	Watch w;

	public SmartWatch(Watch w) {
		this.w = w;
		w.setTime(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat();
		w.setDate(formatter.format(System.currentTimeMillis()));

	}

}
