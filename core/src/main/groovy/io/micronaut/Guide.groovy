package io.micronaut

import groovy.transform.CompileStatic
import groovy.transform.ToString

@CompileStatic
interface Guide {
    List<String> authors
    String category
    String name
    String title
    String subtitle
    List<String> tags
    Date publicationDate
}