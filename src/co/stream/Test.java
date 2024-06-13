package co.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	
	List<TestContestant> l = new ArrayList<TestContestant>();
	l.add(new TestContestant("Heer", "4548139+5466484351"));
	l.add(new TestContestant("meet", "9565969944204"));
	l.add(new TestContestant("rony", "8839525703"));
	l.add(new TestContestant("riza", "9644704999"));
	
	l.stream()
	.map(e -> e.phoneno)
	.filter(e->e.length()==10)
	.distinct()
	.collect(Collectors.collectingAndThen(Collectors.toList(),
    e->{Collections.shuffle(e);
    return e.stream();}))
    .limit(3)
    .forEach(e->{System.out.println("valid number:" + e);});
}
}
