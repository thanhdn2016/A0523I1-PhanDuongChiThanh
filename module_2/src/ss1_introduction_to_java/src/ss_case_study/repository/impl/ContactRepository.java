package ss_case_study.repository.impl;

import ss_case_study.repository.IContactRepository;

public class ContactRepository implements IContactRepository {
    @Override
    public boolean checkDayOfBirth(String dayOfBirth) {
        return false;
    }
}
