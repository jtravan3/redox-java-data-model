
package redox.clinicalsummary.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Relation",
    "Problems"
})
public class FamilyHistory {

    @JsonProperty("Relation")
    private Relation relation;
    @JsonProperty("Problems")
    private List<Problem> problems = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Relation")
    public Relation getRelation() {
        return relation;
    }

    @JsonProperty("Relation")
    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @JsonProperty("Problems")
    public List<Problem> getProblems() {
        return problems;
    }

    @JsonProperty("Problems")
    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
