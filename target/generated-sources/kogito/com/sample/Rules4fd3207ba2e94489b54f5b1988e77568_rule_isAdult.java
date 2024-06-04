package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rules4fd3207ba2e94489b54f5b1988e77568.*;
import static com.sample.Rules4fd3207ba2e94489b54f5b1988e77568.*;

public class Rules4fd3207ba2e94489b54f5b1988e77568_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadata4fd3207ba2e94489b54f5b1988e77568.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata4fd3207ba2e94489b54f5b1988e77568.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.P39.LambdaPredicate39D66F39F59CD30DA8E14C3F7ADFEEF7.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata4fd3207ba2e94489b54f5b1988e77568.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.PA4.LambdaExtractorA403EA458DE1C7D290E39B9C08C1888C.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.P40.LambdaConsequence40C01DCE0777908FFDE8BE0A69B36438.INSTANCE));
        return rule;
    }
}
