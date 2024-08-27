package com.example.demo.service;

import java.util.List;

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

	@Override
	public List<Package> getPackagesByMuseumId(int mid) {
		return prepo.findByMuseumMid(mid);
	}

	@Override
	public String createPackage(Package p) {
		prepo.save(p);
		return "success";
	}
	

}
