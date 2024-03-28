package com.example.PastPaperBICT.Repository;

import com.example.PastPaperBICT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
}
