package com.mitocode.repository;

import com.mitocode.model.User;

public interface IUserRepo extends IGenericRepo<User, Integer>{

    User findOneByUsername(String username);

}
