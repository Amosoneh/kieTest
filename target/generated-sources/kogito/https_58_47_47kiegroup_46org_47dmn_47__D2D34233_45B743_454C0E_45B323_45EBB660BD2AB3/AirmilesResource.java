/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package https_58_47_47kiegroup_46org_47dmn_47__D2D34233_45B743_454C0E_45B323_45EBB660BD2AB3;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.kie.kogito.Application;
import org.kie.kogito.dmn.rest.DMNEvaluationErrorException;
import org.kie.kogito.dmn.rest.DMNJSONUtils;
import org.kie.kogito.dmn.rest.KogitoDMNResult;
import org.kie.kogito.dmn.util.StronglyTypedUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/airmiles")
public class AirmilesResource {

    @org.springframework.beans.factory.annotation.Autowired()
    Application application;

    private static final String KOGITO_DECISION_INFOWARN_HEADER = "X-Kogito-decision-messages";

    private static final String KOGITO_EXECUTION_ID_HEADER = "X-Kogito-execution-id";

    private static final com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper().registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule()).registerModule(new com.fasterxml.jackson.databind.module.SimpleModule().addSerializer(org.kie.dmn.feel.lang.types.impl.ComparablePeriod.class, new org.kie.kogito.dmn.rest.DMNFEELComparablePeriodSerializer())).disable(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).disable(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS);

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(ref = "/dmnDefinitions.json#/definitions/InputSetairmiles")), description = "DMN input")
    @io.swagger.v3.oas.annotations.responses.ApiResponse(content = @io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(ref = "/dmnDefinitions.json#/definitions/OutputSetairmiles")), description = "DMN output")
    public ResponseEntity<?> dmn(@RequestBody(required = false) java.util.Map<String, Object> variables) {
        org.kie.kogito.decision.DecisionModel decision = application.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kiegroup.org/dmn/_D2D34233-B743-4C0E-B323-EBB660BD2AB3", "airmiles");
        org.kie.dmn.api.core.DMNResult decisionResult = decision.evaluateAll(DMNJSONUtils.ctx(decision, variables));
        KogitoDMNResult result = new KogitoDMNResult("https://kiegroup.org/dmn/_D2D34233-B743-4C0E-B323-EBB660BD2AB3", "airmiles", decisionResult);
        return enrichResponseHeaders(decisionResult, extractContextIfSucceded(result));
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public String dmn() throws java.io.IOException {
        return new String(org.drools.util.IoUtils.readBytesFromInputStream(this.getClass().getResourceAsStream(org.kie.dmn.feel.codegen.feel11.CodegenStringUtil.escapeIdentifier("airmiles") + ".dmn_nologic")));
    }

    private Entry<HttpStatus, ?> buildFailedEvaluationResponse(KogitoDMNResult result) {
        return new SimpleEntry(HttpStatus.INTERNAL_SERVER_ERROR, result);
    }

    private Entry<HttpStatus, ?> extractContextIfSucceded(KogitoDMNResult result) {
        if (!result.hasErrors()) {
            return new SimpleEntry(HttpStatus.OK, buildResponse(result.getDmnContext()));
        } else {
            return buildFailedEvaluationResponse(result);
        }
    }

    private Entry<HttpStatus, ?> extractSingletonDSIfSucceded(KogitoDMNResult result) {
        if (!result.hasErrors()) {
            return new SimpleEntry(HttpStatus.OK, buildResponse(result.getDecisionResults().get(0).getResult()));
        } else {
            return buildFailedEvaluationResponse(result);
        }
    }

    private ResponseEntity buildDMNResultResponse(KogitoDMNResult result) {
        if (!result.hasErrors()) {
            return ResponseEntity.ok(buildResponse(result));
        } else {
            Entry<HttpStatus, ?> response = buildFailedEvaluationResponse(result);
            return ResponseEntity.status(response.getKey()).body(response.getValue());
        }
    }

    private String buildResponse(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private ResponseEntity enrichResponseHeaders(org.kie.dmn.api.core.DMNResult result, Entry<HttpStatus, ?> response) {
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(response.getKey());
        if (!result.getMessages().isEmpty()) {
            String infoWarns = result.getMessages().stream().map(m -> m.getLevel() + " " + m.getMessage()).collect(Collectors.joining(", "));
            bodyBuilder.header(KOGITO_DECISION_INFOWARN_HEADER, infoWarns);
        }
        org.kie.kogito.decision.DecisionExecutionIdUtils.getOptional(result.getContext()).ifPresent(executionId -> bodyBuilder.header(KOGITO_EXECUTION_ID_HEADER, executionId));
        return bodyBuilder.body(response.getValue());
    }

    @PostMapping(value = "dmnresult", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(ref = "/dmnDefinitions.json#/definitions/InputSetairmiles")), description = "DMN input")
    public ResponseEntity<?> dmn_dmnresult(@RequestBody(required = false) java.util.Map<String, Object> variables) {
        org.kie.kogito.decision.DecisionModel decision = application.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kiegroup.org/dmn/_D2D34233-B743-4C0E-B323-EBB660BD2AB3", "airmiles");
        org.kie.dmn.api.core.DMNResult decisionResult = decision.evaluateAll(DMNJSONUtils.ctx(decision, variables));
        KogitoDMNResult result = new KogitoDMNResult("https://kiegroup.org/dmn/_D2D34233-B743-4C0E-B323-EBB660BD2AB3", "airmiles", decisionResult);
        return buildDMNResultResponse(result);
    }
}