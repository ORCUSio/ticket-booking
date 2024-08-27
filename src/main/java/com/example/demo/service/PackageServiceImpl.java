package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Package;
import com.example.demo.repository.PackageRepository;


@Service
public class PackageServiceImpl implements PackageService{
	PackageRepository prepo;

	public PackageServiceImpl(PackageRepository prepo) {
		super();
		this.prepo = prepo;
	}

	@Override
	public Package viewDetailedPackage(int pid) {
		return prepo.findById(pid).get();

	}
	

}
