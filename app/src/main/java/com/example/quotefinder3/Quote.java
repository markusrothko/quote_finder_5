package com.example.quotefinder3;

public class Quote {

    private Author author;
    private String quote;
    private String quoteType;


    public Quote(Author author, String quote, String quoteType) {
        this.author = author;
        this.quote = quote;
        this.quoteType = quoteType;
    }

    public Quote (String quote, Author author) {
        this.author = author;
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public Author getAuthor () {
        return author;
    }

}