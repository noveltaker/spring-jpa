package io.gonzo.jpa.app.domain.base;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @CreatedDate
    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private Instant createDate;

    @UpdateTimestamp
    @LastModifiedDate
    @Column(name = "update_date")
    private Instant updateDate;

}