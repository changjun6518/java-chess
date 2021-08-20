# java-chess

---

### 1. 미션 개요
콘솔로 체스 게임을 진행할 수 있는 미션을 진행한다. 체스판에서 각 진영은 대문자 소문자로 구분한다.

---
### 2. 기능 목록
1. 체스 게임을 시작한다
2. 체스판 상황을 보여준다
3. 체스말을 옮긴다
4. 왕(king)을 잡으면 게임이 끝난다
5. 현재 남아있는 말의 점수를 보여준다

---
### 3. 구현 상세
1. 체스판에서 말의 위치는 가로는 a ~ h, 세로는 1 ~ 8로 구현한다
2. 각 말은 알파벳 한글자로 표현한다. P는 pawn, R은 rook, N은 knight, B는 bishop, Q는 queen, K는 king을 의미한다
3. 체스말 움직임은 (시작 위치, 옮기는 위치)로 이동한다
4. "status" 명령을 입력하면 각 진영의 점수를 출력하고 어느 진영이 이겼는지 결과 확인해야 한다
5. queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점이고 pawn은 1점인데 같은 세로줄에 같은 색의 pawn이 있으면 0.5점이다
6. king은 잡히면 경기가 끝나기 때문에 점수 계산 하지 않는다

---
### 4. 구현 목록
- [x] 체스판
    - [x] 체스판 초기화 하기 (기물 배치하기)
    - [x] 검은 색, 흰 색 진영 구분하여 소문자 대문자로 진영 나누기
    - [x] 체스판 현재 상황 보여주기
    - [x] 빈칸 처리하기
- [ ] 체스
    - [x] move source_위치 target_위치로 움직이기
    - [x] Pawn, Rook, Knight, Bishop, Queen, King 기물의 행마법에 따라 움직이기
    - [x] 나의 기물이 상대 기물에 갈 수 있으면 상대 기물을 잡아내기
    - [ ] king을 잡아내면 게임 끝내기
    - [ ] "status" 명령을 입력하면 현재 체스 기물 점수 합으로 승리 결정
  
---
### 다음 할일
