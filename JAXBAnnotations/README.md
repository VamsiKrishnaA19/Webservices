# JAXBAnnotations

@XmlRootElement is by default displaying properties in the Ascending order. For example a,b,c...z;

** If you want to display properties in specific order then write the below annaotations.

** XML - @XmlType(propOrder={"bookName", "bookDesc"})

** JSON - @JsonPropertyOrder({"bookName", "bookDesc"})