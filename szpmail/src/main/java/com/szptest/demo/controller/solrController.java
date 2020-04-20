package com.szptest.demo.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.MapSolrParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class solrController {
    @Autowired
    private SolrClient solrClient;

    @RequestMapping("/solr")
    @ResponseBody
    public String testSolr() throws SolrServerException, IOException
    {
        Map<String, String> queryParamMap = new HashMap<String, String>();
        queryParamMap.put("q", "*:*");
        //queryParamMap.put("f1", "id,name");
       // queryParamMap.put("sort", "id asc");
        MapSolrParams mapSolrParams = new MapSolrParams(queryParamMap);
        QueryResponse query = solrClient.query(mapSolrParams);
        SolrDocumentList results = query.getResults();
       // SolrDocument doc = solrClient.getById("562379");
        return results.toString();
    }
}
