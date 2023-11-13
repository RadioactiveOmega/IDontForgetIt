package com.myProjects.IDontForgetIt.services;

import com.myProjects.IDontForgetIt.repos.RecordRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class RecordService {

    private RecordRepo recordRepo;

    public boolean createRecord(){


        return true;
    }
}
