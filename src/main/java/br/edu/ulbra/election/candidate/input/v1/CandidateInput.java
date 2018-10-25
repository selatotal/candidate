package br.edu.ulbra.election.candidate.input.v1;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Candidate Input Information")
public class CandidateInput {

    @ApiModelProperty(example = "John Doe", notes = "Candidate name")
    private String name;
    @ApiModelProperty(example = "1", notes = "Candidate Party ID")
    private Long partyId;
    @ApiModelProperty(example = "97654", notes = "Candidate Election Number")
    private Long numberElection;
    @ApiModelProperty(example = "3", notes = "Candidate Election Id")
    private Long electionId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getNumberElection() {
        return numberElection;
    }

    public void setNumberElection(Long numberElection) {
        this.numberElection = numberElection;
    }

    public Long getElectionId() {
        return electionId;
    }

    public void setElectionId(Long electionId) {
        this.electionId = electionId;
    }
}
