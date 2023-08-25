package com.polarmb.portfolio_backend.infrastructure.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTERN);

    public static String formatDate(Date date) {
        return simpleDateFormat.format(date);
    }


}
