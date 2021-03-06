package me.javaroad.mcloud.blog.entity;

import java.util.Set;
import java.util.TreeSet;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import me.javaroad.data.entity.TemporalEntity;

/**
 * @author heyx
 */
@Getter
@Setter
@Entity
@Table(name = "blog_label")
public class Label extends TemporalEntity {

    private String name;
    @ManyToMany(mappedBy = "labels")
    private Set<Article> articles = new TreeSet<>();
}
