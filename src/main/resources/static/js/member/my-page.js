$(document).ready(function () {
    // 재원님 작업 완료 되면 onclick시 나의 일정, 게시물, 댓글 링크 걸기
    const editProfile = $(".editProfile");
    const asideMenuContainer = $(".asideMenuContainer");
    const profileContentsContainer = $(".profileContentsContainer");
    const backwardButton = $(".backwardButton");

    const myProfileContainer = $(".myProfileContainer");
    const myProfile = $(".myProfile");
    const myProfileButton = $(".myProfileButton");

    const membershipWithdrawalContainer = $(".membershipWithdrawalContainer");
    const membershipWithdrawal = $(".membershipWithdrawal");
    const membershipWithdrawalLinkButton = $(".membershipWithdrawalLinkButton");

    const verifyNickname = $(".verifyNickname");
    const saveNickname = $(".saveNickname");

    const serviceNotificationAgreementContainer = $(".serviceNotificationAgreementContainer");
    const serviceNotificationLabel = $("#serviceNotificationLabel");

    const commercialNotificationAgreementContainer = $(".commercialNotificationAgreementContainer");
    const commercialNotificationLabel = $("#commercialNotificationLabel");

    const profileContents = $(".profileContents");
    const membershipWithdrawalWrapper = $(".membershipWithdrawalWrapper");
    const mainBorderDividingLine = $(".mainBorderDividingLine");
    const notificationSettingTitle = $(".notificationSettingTitle");
    const notificationSettingContainer = $(".notificationSettingContainer");

    // 1. myProfileContainer나 membershipWithdrawalContainer onclick시 선택된 컨텐츠 class에 active 추가하고 다른 컨테이너 html에서 class 속성 중에 active 빼기
    myProfileContainer.on("click", function (e) {
        changeActive(e);
    });
    membershipWithdrawalContainer.on("click", function (e) {
        changeActive(e);
    });

    function changeActive(event) {
        if (event.target === myProfile || event.target === myProfileButton) {
            myProfileContainer.addClass("active");
            membershipWithdrawalContainer.removeClass("active");
            myProfile.css("color", "#040505");
            membershipWithdrawal.css("color", "#adb3b8");
        } else if (
            event.target === membershipWithdrawal ||
            event.target === membershipWithdrawalLinkButton
        ) {
            membershipWithdrawalContainer.addClass("active");
            myProfileContainer.removeClass("active");
            myProfile.css("color", "#adb3b8");
            membershipWithdrawal.css("color", "#040505");
        }
    }

    /*
    닉네임 에러시
    .nicknameBox {
      border-color: #e92525;
      color: #e92525;
    }

    .nicknameUpdateMessageContainer {
      color: rgb(233, 37, 37);
    }

    .nicknameUpdateMessageContainer > svg {
      fill: rgb(233, 37, 37) !important;
    }
    */

    $(document).on("click", function (e) {
        // 2. 닉네임 중복확인 버튼 누를시 중복확인 버튼 css에 background-color: #d4e5f9; 저장 버튼 css에 background-color: #2a7de1; 주기
        if (e.target === verifyNickname) {
            verifyNickname.css("background-color", "#d4e5f9");
            saveNickname.css("background-color", "#2a7de1");
            saveNickname.css("cursor", "pointer");
        }

        // 3. 저장 버튼 누를시 저장 버튼 css에 background-color: #1b5192; 주기
        if (e.target === saveNickname) {
            verifyNickname.css("background-color", "#fff");
            saveNickname.css("background-color", "#1b5192");
        }

        // 4. 중복확인이나 저장버튼 밖을 누르면 색깔 다시 돌아오기
        if (e.target !== (verifyNickname && saveNickname)) {
            if (verifyNickname.css("background-color") === "#d4e5f9") {
                verifyNickname.css("background-color", "#fff");
                saveNickname.css("background-color", "#2a7de1");
                saveNickname.css("cursor", "not-allowed");
            }
            if (saveNickname.css("background-color") === "#1b5192") {
                verifyNickname.css("background-color", "#fff");
                saveNickname.css("background-color", "#2a7de1");
                saveNickname.css("cursor", "not-allowed");
            }
        }
        // 5. 큰 옵션 선택하면 초기화되는 기능
        if (
            e.target === editProfile ||
            e.target === backwardButton ||
            e.target === myProfile ||
            e.target === membershipWithdrawal
        ) {
            verifyNickname.css("background-color", "#fff");
            saveNickname.css("background-color", "#d4e5f9");
            saveNickname.css("cursor", "not-allowed");
        }
    });

    // 6. 서비스 알림 동의, 광고 알림 동의 버튼 누를 시 label 태그에 checked 추가하기, 이미 checked되 있는 상태에서 다시 한번 누르면 checked 삭제하기
    serviceNotificationAgreementContainer.on("click", function (e) {
        changeChecked(e);
    });
    commercialNotificationAgreementContainer.on("click", function (e) {
        changeChecked(e);
    });

    function changeChecked(event) {
        if (event.target === serviceNotificationAgreementContainer) {
            if (serviceNotificationLabel.hasClass("checked")) {
                serviceNotificationLabel.removeClass("checked");
            } else {
                serviceNotificationLabel.addClass("checked");
            }
        } else if (event.target === commercialNotificationAgreementContainer) {
            if (commercialNotificationLabel.hasClass("checked")) {
                commercialNotificationLabel.removeClass("checked");
            } else {
                commercialNotificationLabel.addClass("checked");
            }
        }
    }

    //7. 회원탈퇴 링크버튼 누를 시 profileContentsContainer 에서 profileContentsHeader, membershipWithdrawalWrapper만  display: block 설정하고 나머지 요소들에 display: none 설정하기
    membershipWithdrawalLinkButton.on("click", function () {
        profileContents.css("display", "none");
        myProfileContainer.removeClass("active")
        myProfile.removeClass("active-font");
        mainBorderDividingLine.css("display", "none");
        notificationSettingTitle.css("display", "none");
        notificationSettingContainer.css("display", "none");
        membershipWithdrawalWrapper.css("display", "block");
        membershipWithdrawalContainer.addClass("active");
        membershipWithdrawal.addClass("active-font");
    });
    myProfile.on("click", function () {
        profileContents.css("display", "block");
        mainBorderDividingLine.css("display", "block");
        myProfileContainer.addClass("active");
        myProfile.addClass("active-font");
        notificationSettingTitle.css("display", "block");
        notificationSettingContainer.css("display", "block");
        membershipWithdrawalWrapper.css("display", "none");
        membershipWithdrawalContainer.removeClass("active");
        membershipWithdrawal.removeClass("active-font")
    });

    // 8. 개인정보 설정 누르면 asideMenuContainer 숨기고 profileContentsContainer 보이기, backwardButton 누르면 반대로 적용
    $(window).on("resize", function () {
        asideMenuContainer.css("display", "block");
        profileContentsContainer.css("display", "block");
    });
    if ($(window).width() < 1001) {
        editProfile.on("click", function () {
            asideMenuContainer.css("display", "none");
            profileContentsContainer.css("display", "block");
        });
        backwardButton.on("click", function () {
            asideMenuContainer.css("display", "block");
            profileContentsContainer.css("display", "none");
        });
    }

    // 9. 휴대폰 번호 유효성 검사
    $(".phoneNumberBox").on("input", function () {
        // 입력된 값 가져오기
        let inputValue = $(this).val();
        let button = $(".saveContactInfo");

        // 숫자가 아닌 문자 제거 (숫자 이외의 모든 문자를 빈 문자열로 대체)
        inputValue = inputValue.replace(/[^0-9]/g, "");

        // 숫자만 입력된 값을 다시 필드에 설정
        $(this).val(inputValue);

        // 길이 확인
        if (inputValue.length !== 11 && inputValue.length !== 0) {
            // 에러 메시지를 보이게 하고, 유효하지 않은 스타일 적용
            $(".phoneNumberErrorMessage").css("display", "block");
            $(this).css("border-color", "#e92525");
            // 저장 버튼 비활성화
            button.prop("disabled", true);
            button.css("background-color", "#d4e5f9");
            button.css("cursor", "not-allowed");
        } else {
            // 에러 메시지를 숨기고, 유효한 스타일 적용
            $(".phoneNumberErrorMessage").css("display", "none");
            $(this).css("border-color", ""); // 기본 스타일로 복원
            // 저장 버튼 활성화
            button.prop("disabled", false);
            button.css("background-color", "#2A7DE1");
            button.css("cursor", "pointer");
        }
    });

    $(document).on("click", function (e) {
        console.log(e.target);
    });
});
