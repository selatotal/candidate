package br.edu.ulbra.election.candidate.repository;

import br.edu.ulbra.election.candidate.model.Candidate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
    Candidate findFirstByNumberElectionAndElectionId(Long numberElection, Long electionId);

    List<Candidate> findAllByElectionId(Long electionId);

    List<Candidate> findAllByPartyId(Long partyId);

}
