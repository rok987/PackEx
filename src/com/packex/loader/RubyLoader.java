package com.packex.loader;

import com.google.gson.Gson;
import com.packex.Constants;
import com.packex.connector.HttpConnector;
import com.packex.model.pkgmgr.RubyDownloadData;

public class RubyLoader implements LanguageLoader {
    private String packageName;
    private String url;
    private RubyDownloadData data;
    
    public RubyLoader(String packageName) {
        this.packageName = packageName;
        this.url = String.format(Constants.RUBY_URL_TEMPLATE, this.packageName);
    }
    
    public void loadData() {
        HttpConnector connector = HttpConnector.getInstance();
        String response = connector.get(this.url);
        
        Gson gson = new Gson();
        this.data = gson.fromJson(response, RubyDownloadData.class);
    }
    
    public RubyDownloadData getDownloadData() {
        return this.data;
    }
    
    public static void main(String[] args) {
        RubyLoader loader = new RubyLoader("google-api-client");
        loader.loadData();
        RubyDownloadData data = loader.getDownloadData(); 
        
        System.out.println(data.getName());
        System.out.println(data.getDownloads());
        System.out.println(data.getVersion());
        System.out.println(data.getVersionDownloads());
    }
}
