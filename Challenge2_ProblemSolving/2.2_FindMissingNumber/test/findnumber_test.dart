import 'package:challenge_2_2/findnumber.dart';
import 'package:test/expect.dart';
import 'package:test/scaffolding.dart';

void main(){
  test('', (){
    List<int> numbers1 = [1,2,3,5,6];
    expect(findMissingNumber(numbers1), equals(4));
    // Check other arrays
    List<int> numbers2 = [3, 7, 1, 2, 6, 4];
    expect(findMissingNumber(numbers2), equals(5));  

  });
}