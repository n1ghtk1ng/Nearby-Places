package com.example.aman.nearbyplaces.Model;

public class MyPlaces {
    private String[] html_attributions;

    private Results[] results;

    private String status;

    public String[] getHtml_attributions ()
    {
        return html_attributions;
    }

    public void setHtml_attributions (String[] html_attributions)
    {
        this.html_attributions = html_attributions;
    }

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [html_attributions = "+html_attributions+", results = "+results+", status = "+status+"]";
    }
}
