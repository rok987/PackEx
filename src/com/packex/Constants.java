package com.packex;

public class Constants {
    public static final String PACKAGES_FILE_PATH = "./resources/packages.json";
    
    // Languages
    public static final String JAVA_LANGUAGE = "JAVA";
    public static final String RUBY_LANGUAGE = "RUBY";
    public static final String NODE_LANGUAGE = "NODE";
    public static final String PHP_LANGUAGE = "PHP";
    public static final String PYTHON_LANGUAGE = "PYTHON";
    public static final String DOTNET_LANGUAGE = "DOTNET";
    
    // Package management URL sites
    public static final String RUBY_URL_TEMPLATE = "https://rubygems.org/api/v1/gems/%s.json";
    public static final String PHP_URL_TEMPLATE = "https://packagist.org/packages/%s.json";
    public static final String PYTHON_URL_TEMPLATE = "https://pypi.python.org/pypi/%s/json";
    public static final String PYTHON_HTML_URL_TEMPLATE = "https://pypi.python.org/pypi/%s";
    public static final String NODE_DAY_URL_TEMPLATE = "https://api.npmjs.org/downloads/point/last-day/%s";
    public static final String NODE_WEEK_URL_TEMPLATE = "https://api.npmjs.org/downloads/point/last-week/%s";
    public static final String NODE_MONTH_URL_TEMPLATE = "https://api.npmjs.org/downloads/point/last-month/%s";
    public static final String DOTNET_HTML_URL_TEMPLATE = "https://www.nuget.org/packages/%s/";
    
    // Python html constants
    public static final String PYTHON_CLASS_SEARCH = "nodot";
    public static final String PYTHON_DOWNLOADS_TEXT = "Downloads (All Versions):";
    public static final String PYTHON_DOWNLOADS_LAST_DAY = "downloads in the last day";
    public static final String PYTHON_DOWNLOADS_LAST_WEEK = "downloads in the last week";
    public static final String PYTHON_DOWNLOADS_LAST_MONTH = "downloads in the last month";
    
    // Dotnet html constants
    public static final String DOTNET_ID_SEARCH = "stats";
    public static final String DOTNET_CLASS_SEARCH = "stat";
    public static final String DOTNET_STAT_LABEL = "stat-label";
    public static final String DOTNET_STAT_NUMBER = "stat-number";
    public static final String DOTNET_DOWNLOADS_TEXT = "Downloads";
    
    // BigQuery constants
    public static final String BQ_DATASET_NAME = "package_downloads";
    public static final String BQ_TABLE_NAME = "%s_data";
    public static final String BQ_DATASET_TEST_NAME = "package_downloads_test";
    public static final String BQ_TABLE_TEST_NAME = "%s_data_test";
    public static final String NEW_DAY_TIME = " 00:00:00";
    public static final String ALL_VERSIONS = "all";
    
    // BigQuery table fields
    public static final String DATE_FIELD = "date";
    public static final String LANGUAGE_FIELD = "language";
    public static final String PACKAGE_NAME_FIELD = "package_name";
    public static final String VERSION_FIELD = "version";
    public static final String CATEGORY_FIELD = "category";
    public static final String TOTAL_DOWNLOADS_FIELD = "total_downloads";
    public static final String MONTHLY_DOWNLOADS_FIELD = "monthly_downloads";
    public static final String WEEKLY_DOWNLOADS_FIELD = "weekly_downloads";
    public static final String DAILY_DOWNLOADS_FIELD = "daily_downloads";
    public static final String MONTHLY_CALCULATED_DOWNLOADS_FIELD = "monthly_calculated_downloads";
    public static final String WEEKLY_CALCULATED_DOWNLOADS_FIELD = "weekly_calculated_downloads";
    public static final String DAILY_CALCULATED_DOWNLOADS_FIELD = "daily_calculated_downloads";
}
