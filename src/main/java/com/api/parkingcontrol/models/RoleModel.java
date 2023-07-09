package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.parkingcontrol.enums.RoleName;

@Entity
@Table(name = "TB_ROLE")
public class RoleModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roleId;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;



    public UUID getRoleId() {
        return this.roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public RoleName getRoleName() {
        return this.roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
    
}
