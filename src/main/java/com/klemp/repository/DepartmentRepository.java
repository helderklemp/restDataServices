package com.klemp.repository;

import com.klemp.model.Department;
import com.klemp.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by helderklemp on 9/12/2015.
 */
@RepositoryRestResource
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
}
