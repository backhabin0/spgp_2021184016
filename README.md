# spgp_2021184016
# 스마트폰 게임프로그래밍 텀프로젝트
## 게임컨셉 
- 프로젝트 이름: cooking craze
- 설명: 플레이어를 스릴 넘치는 요리의 혼돈 세계로 몰입 시키는 요리게임. 요리사는 분주한 주방을 관리하고 맛있는 요리를 준비하고 손님에게 빠르고 정확하게 음식을 제공한다. 직관적인 게임 플레이 , 생동감 넘치는 비주얼 , 중독성 있는 메커니즘을 가지고있다
- 핵심 메커니즘:주문을 관리하고 재료를 선택하여 정확도있게 요리를 준비하고 번 돈으로 부엌 장비를 업그레이드 하여 효율성을 높이기.

## 게임방법
1.게임의 목표는 1,000,000원을 벌어내는 것. 

2.하루하루 손님의 주문에 맞춰 재료를 클릭하고 조리하여 요리를 완성해야한다. 날이 지날때마다 음식 나오는 시간이 줄어든다

3.요리를 잘못 조리시에는 폐기하게 되고 , 돈을 잃는다. 파산하게 되면 게임 종료

4.돈을 벌어서 조리도구 및 부스터를 구매하여 효율성을 높인다.


## 예상 게임 흐름 
1. 지도에서 오픈하고 싶은 레스토랑 선택.
![1](https://github.com/backhabin0/spgp_2021184016/assets/115928688/8a1c7fcf-723e-42e2-ae8f-8bc5f80e0841)
2. 주문이 들어오면 알맞은 재료를 터치를 통해 선택하여 조리를 하고 시간안에 맞춰서 음식 제출을 해야하게 된다.
   한 라운드당 약 3분소요, 손님은 10초마다 계속 생성 (라운드 올라갈 수록 10초에서 계속 줄어들음) 
![제목을-입력해주세요_-001 (4)](https://github.com/backhabin0/spgp_2021184016/assets/115928688/26ae6673-5c7c-4a60-ac3d-81fafd801db1)
4. 하루 주문이 끝나면 아이템을 사용하여 주방 강화를 할 수 있다 .
![제목을-입력해주세요_-001 (3)](https://github.com/backhabin0/spgp_2021184016/assets/115928688/f3aa27ec-81ed-49de-9127-1cb78c690d44)

  
5. 목표 금액을 모으게 되면, 다시 로비 지도 화면으로 이동하여, 음식점을 키워나갈 수 있다

## 개발 범위 및 일정
### 개발범위
|내용|개발범위|
|------|---|
|플레이어 컨트롤러|터치와 스크롤|
|UI|상점 , 재화 , 생명 , 프로그래스 바 등과같은 UI|
|충돌처리|재료가 올바른 위치에 있는지 충돌 처리|
|로비 맵|설정이 가능한 로비맵|
|사운드|다양한 요리 사운드|
|애니메이션|요리 애니메이션|

### 개발일정 
|개발 일정|개발 내용|
|------|---|
|1주차(4/4~4/10)|게임 리소스 수집|
|2주차(4/11~4/17)|게임 리소스 수집 , 컨트롤러|
|3주차(4/18~4/24)|인게임 UI , 충돌처리 |
|4주차(4/25~5/1)|충돌처리 , 인게임 재화 구현|
|5주차(5/2~5/8)|상점 구현 , 라운드 |
|6주차(5/9~5/15)|로비 맵 구현|
|7주차(5/16~5/22)|사운드삽입 , 성공 화면 , 실패 화면 제작|
|8주차(5/23~5/29)|버그 수정 및 테스트|
|9주차(5/30~6/5)|버그 수정 및 테스트|


##발표 영상 링크 
https://youtu.be/TLABqq4Ihfk



# 스마트폰 게임 프로그래밍 2차 발표
# 게임 개요 
손님들의 니즈에 맞춰 빠르게 음식을 제공하고 번 돈으로 주방강화를 통해 점차 식당을 확장해 나가는게임.
|개발 일정|개발 내용|진행|
|------|---|---|
|1주차(4/4~4/10)|게임 리소스 수집|100%|
|2주차(4/11~4/17)|게임 리소스 수집 , 컨트롤러|100%|
|3주차(4/18~4/24)|인게임 UI , 충돌처리 |0%|
|4주차(4/25~5/1)|충돌처리 , 인게임 재화 구현|0%|
|5주차(5/2~5/8)|상점 구현 , 라운드 |50%|
|6주차(5/9~5/15)|로비 맵 구현|-|
|7주차(5/16~5/22)|사운드삽입 , 성공 화면 , 실패 화면 제작|-|
|8주차(5/23~5/29)|버그 수정 및 테스트|-|
|9주차(5/30~6/5)|버그 수정 및 테스트|-|

## 주차별 git commit 횟수 
|개발 일정|개발 내용|
|------|---|
|1주차(4/4~4/10)|8|
|2주차(4/11~4/17)|0|
|3주차(4/18~4/24)|0|
|4주차(4/25~5/1)|0|
|5주차(5/2~5/8)|5|


![image](https://github.com/backhabin0/spgp_2021184016/assets/115928688/800ca860-aa49-4c62-aa57-9c7ff88d435e)


## MainScene클래스 구성정보 
![image](https://github.com/backhabin0/spgp_2021184016/assets/115928688/277ae606-1faf-49bf-b95c-482eaa60784a)

# food 주요코드
![image](https://github.com/backhabin0/spgp_2021184016/assets/115928688/1d88e6b4-c7db-44b0-8d26-3755e7ceac35)
 코드는 게임에서 라운드에 맞는 객체를 생성하고 초기 위치를 설정하는 역할을 합니다.
# round Activity 주요코드
![image](https://github.com/backhabin0/spgp_2021184016/assets/115928688/7571e6a9-04c8-48aa-841f-d2ad17cf4d89)
이미지뷰를 클릭할때마다 이전 이미지를 삭제하고 새로운 이미지를 추



