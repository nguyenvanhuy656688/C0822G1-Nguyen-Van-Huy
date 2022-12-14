package com.case_study.service.contract;

import com.case_study.model.contract.ContractDetail;
import com.case_study.repository.contract.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailService implements IContractDetailService{
    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public void save(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }
}
