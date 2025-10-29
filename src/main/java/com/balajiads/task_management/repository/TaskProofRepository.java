package com.balajiads.task_management.repository;

import com.balajiads.task_management.entity.TaskProof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskProofRepository extends JpaRepository<TaskProof, Long> {

    // Find all proofs associated with a specific task.
    List<TaskProof> findByTaskId(Long taskId);
}
