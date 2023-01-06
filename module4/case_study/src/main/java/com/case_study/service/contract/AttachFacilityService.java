package com.case_study.service.contract;

import com.case_study.model.contract.AttachFacility;
import com.case_study.repository.contract.IAttackFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService{
    @Autowired
    private IAttackFacilityRepository iAttackFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return iAttackFacilityRepository.findAll();
    }
}
