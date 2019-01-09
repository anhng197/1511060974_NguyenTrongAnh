-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 09, 2019 lúc 04:18 PM
-- Phiên bản máy phục vụ: 10.1.33-MariaDB
-- Phiên bản PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlnhanvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bangcap`
--

CREATE TABLE `bangcap` (
  `mabangcap` int(11) NOT NULL,
  `tenbangcap` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `machucvu` int(11) NOT NULL,
  `tenchucvu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `congviec`
--

CREATE TABLE `congviec` (
  `macongviec` int(11) NOT NULL,
  `tencongviec` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `madantoc` int(11) NOT NULL,
  `tendantoc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocvan`
--

CREATE TABLE `hocvan` (
  `mahocvan` int(11) NOT NULL,
  `tenhocvan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loainhanvien`
--

CREATE TABLE `loainhanvien` (
  `maloainhanvien` int(11) NOT NULL,
  `tenloainhanvien` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ngoaingu`
--

CREATE TABLE `ngoaingu` (
  `mangoaingu` int(11) NOT NULL,
  `tenngoaingu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manhanvien` int(11) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `bidanh` varchar(255) NOT NULL,
  `didong` varchar(255) NOT NULL,
  `dienthoainha` int(11) NOT NULL,
  `diachiemail` int(11) NOT NULL,
  `ngaysinh` date NOT NULL,
  `noisinh` varchar(255) NOT NULL,
  `matinhthanh` int(11) NOT NULL,
  `cmnd` int(11) NOT NULL,
  `ngaycapcmnd` date NOT NULL,
  `noicapcmnd` varchar(255) NOT NULL,
  `quequan` varchar(255) NOT NULL,
  `diachi` varchar(255) NOT NULL,
  `tamtru` varchar(255) NOT NULL,
  `maloainhanvien` int(11) NOT NULL,
  `ngayvaolam` date NOT NULL,
  `maphongban` int(11) NOT NULL,
  `macongviec` int(11) NOT NULL,
  `machucvu` int(11) NOT NULL,
  `mucluongcb` int(11) NOT NULL,
  `heso` int(11) NOT NULL,
  `mucluong` int(11) NOT NULL,
  `phucapluong` int(11) NOT NULL,
  `sosolaodong` int(11) NOT NULL,
  `ngaycapsolaodong` date NOT NULL,
  `noicapsolaodong` int(11) NOT NULL,
  `taikhoannganhang` int(11) NOT NULL,
  `nganhang` int(11) NOT NULL,
  `mahocvan` int(11) NOT NULL,
  `mabangcap` int(11) NOT NULL,
  `mangoaingu` int(11) NOT NULL,
  `matinhoc` int(11) NOT NULL,
  `madantoc` int(11) NOT NULL,
  `maquoctich` int(11) NOT NULL,
  `matongiao` int(11) NOT NULL,
  `gioitinh` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `maphongban` int(11) NOT NULL,
  `tenphongban` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quoctich`
--

CREATE TABLE `quoctich` (
  `maquoctich` int(11) NOT NULL,
  `tenquoctich` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhoc`
--

CREATE TABLE `tinhoc` (
  `matinhoc` int(11) NOT NULL,
  `tentinhoc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhthanh`
--

CREATE TABLE `tinhthanh` (
  `matinhthanh` int(11) NOT NULL,
  `tentinhthanh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `matongiao` int(11) NOT NULL,
  `tentongiao` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bangcap`
--
ALTER TABLE `bangcap`
  ADD PRIMARY KEY (`mabangcap`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`machucvu`);

--
-- Chỉ mục cho bảng `congviec`
--
ALTER TABLE `congviec`
  ADD PRIMARY KEY (`macongviec`);

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`madantoc`);

--
-- Chỉ mục cho bảng `hocvan`
--
ALTER TABLE `hocvan`
  ADD PRIMARY KEY (`mahocvan`);

--
-- Chỉ mục cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  ADD PRIMARY KEY (`maloainhanvien`);

--
-- Chỉ mục cho bảng `ngoaingu`
--
ALTER TABLE `ngoaingu`
  ADD PRIMARY KEY (`mangoaingu`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manhanvien`),
  ADD KEY `nhanvien_mabangcap` (`mabangcap`),
  ADD KEY `nhanvien_machucvu` (`machucvu`),
  ADD KEY `nhanvien_macongviec` (`macongviec`),
  ADD KEY `nhanvien_madantoc` (`madantoc`),
  ADD KEY `nhanvien_mahocvan` (`mahocvan`),
  ADD KEY `nhanvien_maloainhanvien` (`maloainhanvien`),
  ADD KEY `nhanvien_mangoaingu` (`mangoaingu`),
  ADD KEY `nhanvien_maphongban` (`maphongban`),
  ADD KEY `nhanvien_matinhoc` (`matinhoc`),
  ADD KEY `nhanvien_matinhthanh` (`matinhthanh`),
  ADD KEY `nhanvien_matongiao` (`matongiao`),
  ADD KEY `nhanvien_maquoctich` (`maquoctich`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`maphongban`);

--
-- Chỉ mục cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`maquoctich`);

--
-- Chỉ mục cho bảng `tinhoc`
--
ALTER TABLE `tinhoc`
  ADD PRIMARY KEY (`matinhoc`);

--
-- Chỉ mục cho bảng `tinhthanh`
--
ALTER TABLE `tinhthanh`
  ADD PRIMARY KEY (`matinhthanh`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`matongiao`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bangcap`
--
ALTER TABLE `bangcap`
  MODIFY `mabangcap` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `machucvu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `congviec`
--
ALTER TABLE `congviec`
  MODIFY `macongviec` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  MODIFY `madantoc` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hocvan`
--
ALTER TABLE `hocvan`
  MODIFY `mahocvan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  MODIFY `maloainhanvien` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ngoaingu`
--
ALTER TABLE `ngoaingu`
  MODIFY `mangoaingu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `manhanvien` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `phongban`
--
ALTER TABLE `phongban`
  MODIFY `maphongban` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  MODIFY `maquoctich` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tinhoc`
--
ALTER TABLE `tinhoc`
  MODIFY `matinhoc` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tinhthanh`
--
ALTER TABLE `tinhthanh`
  MODIFY `matinhthanh` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  MODIFY `matongiao` int(11) NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_mabangcap` FOREIGN KEY (`mabangcap`) REFERENCES `bangcap` (`mabangcap`),
  ADD CONSTRAINT `nhanvien_machucvu` FOREIGN KEY (`machucvu`) REFERENCES `chucvu` (`machucvu`),
  ADD CONSTRAINT `nhanvien_macongviec` FOREIGN KEY (`macongviec`) REFERENCES `congviec` (`macongviec`),
  ADD CONSTRAINT `nhanvien_madantoc` FOREIGN KEY (`madantoc`) REFERENCES `dantoc` (`madantoc`),
  ADD CONSTRAINT `nhanvien_mahocvan` FOREIGN KEY (`mahocvan`) REFERENCES `hocvan` (`mahocvan`),
  ADD CONSTRAINT `nhanvien_maloainhanvien` FOREIGN KEY (`maloainhanvien`) REFERENCES `loainhanvien` (`maloainhanvien`),
  ADD CONSTRAINT `nhanvien_mangoaingu` FOREIGN KEY (`mangoaingu`) REFERENCES `ngoaingu` (`mangoaingu`),
  ADD CONSTRAINT `nhanvien_maphongban` FOREIGN KEY (`maphongban`) REFERENCES `phongban` (`maphongban`),
  ADD CONSTRAINT `nhanvien_maquoctich` FOREIGN KEY (`maquoctich`) REFERENCES `quoctich` (`maquoctich`),
  ADD CONSTRAINT `nhanvien_matinhoc` FOREIGN KEY (`matinhoc`) REFERENCES `tinhoc` (`matinhoc`),
  ADD CONSTRAINT `nhanvien_matinhthanh` FOREIGN KEY (`matinhthanh`) REFERENCES `tinhthanh` (`matinhthanh`),
  ADD CONSTRAINT `nhanvien_matongiao` FOREIGN KEY (`matongiao`) REFERENCES `tongiao` (`matongiao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
