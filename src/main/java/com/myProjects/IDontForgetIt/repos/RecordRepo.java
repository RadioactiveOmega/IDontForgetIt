package com.myProjects.IDontForgetIt.repos;

import com.myProjects.IDontForgetIt.domain.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepo extends CrudRepository<Record, Long> {
}
