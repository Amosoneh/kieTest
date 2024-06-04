package com.sample;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.sample.Person;
import static com.sample.Rules540828afdc5b42b6aee61345a0014903.*;
import static com.sample.Rules540828afdc5b42b6aee61345a0014903.*;

public class Rules540828afdc5b42b6aee61345a0014903_rule_isAdult {

    /**
     * Rule name: isAdult
     */
    public static org.drools.model.Rule rule_isAdult() {
        final org.drools.model.Variable<com.sample.Person> var_$person = D.declarationOf(com.sample.Person.class,
                                                                                         DomainClassesMetadata540828afdc5b42b6aee61345a0014903.com_sample_Person_Metadata_INSTANCE,
                                                                                         "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata540828afdc5b42b6aee61345a0014903.com_sample_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("com.sample",
                                            "isAdult")
                                      .build(D.pattern(var_$person).expr("GENERATED_3CC8CD9E65F11B356E8907D5C55B47AB",
                                                                         com.sample.P95.LambdaPredicate955B109E7833F1F9E61B53618C57E281.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata540828afdc5b42b6aee61345a0014903.com_sample_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          com.sample.P52.LambdaExtractor52CB605C4E4E6D26F2E8FA6752834BD2.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(com.sample.P0D.LambdaConsequence0DF52008729A646AF4D71F6FDEA8DE6B.INSTANCE));
        return rule;
    }
}
