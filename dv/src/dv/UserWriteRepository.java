package dv;

public interface UserWriteRepository {
	    void save(user useri);
	    void update(user useri);
	    void delete(Long id);
}
