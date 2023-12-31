USE [master]
GO
/****** Object:  Database [Users]    Script Date: 2023-12-07 12:47:04 PM ******/
CREATE DATABASE [Users]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Users', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\Users.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Users_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\Users_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [Users] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Users].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Users] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Users] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Users] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Users] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Users] SET ARITHABORT OFF 
GO
ALTER DATABASE [Users] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Users] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Users] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Users] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Users] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Users] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Users] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Users] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Users] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Users] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Users] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Users] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Users] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Users] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Users] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Users] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Users] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Users] SET RECOVERY FULL 
GO
ALTER DATABASE [Users] SET  MULTI_USER 
GO
ALTER DATABASE [Users] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Users] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Users] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Users] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Users] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Users] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Users', N'ON'
GO
ALTER DATABASE [Users] SET QUERY_STORE = ON
GO
ALTER DATABASE [Users] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [Users]
GO
/****** Object:  Table [dbo].[User]    Script Date: 2023-12-07 12:47:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[address_line] [nvarchar](255) NULL,
	[city] [nvarchar](255) NULL,
	[latitude] [decimal](10, 6) NULL,
	[longitude] [decimal](10, 6) NULL,
	[postal_code] [nvarchar](20) NULL,
	[state] [nvarchar](255) NULL,
	[age] [int] NULL,
	[card_expire] [nvarchar](10) NULL,
	[card_number] [nvarchar](20) NULL,
	[card_type] [nvarchar](20) NULL,
	[currency] [nvarchar](10) NULL,
	[iban] [nvarchar](50) NULL,
	[birth_date] [nvarchar](20) NULL,
	[blood_group] [nvarchar](5) NULL,
	[company_address_line] [nvarchar](255) NULL,
	[company_city] [nvarchar](255) NULL,
	[company_latitude] [decimal](10, 6) NULL,
	[company_longitude] [decimal](10, 6) NULL,
	[company_postal_code] [nvarchar](20) NULL,
	[company_state] [nvarchar](255) NULL,
	[company_department] [nvarchar](255) NULL,
	[company_name] [nvarchar](255) NULL,
	[company_title] [nvarchar](255) NULL,
	[domain] [nvarchar](255) NULL,
	[ein] [nvarchar](20) NULL,
	[email] [nvarchar](255) NULL,
	[eye_color] [nvarchar](20) NULL,
	[first_name] [nvarchar](255) NULL,
	[gender] [nvarchar](10) NULL,
	[hair_color] [nvarchar](20) NULL,
	[hair_type] [nvarchar](20) NULL,
	[height] [decimal](5, 2) NULL,
	[image] [nvarchar](255) NULL,
	[ip] [nvarchar](50) NULL,
	[last_name] [nvarchar](255) NULL,
	[mac_address] [nvarchar](50) NULL,
	[maiden_name] [nvarchar](255) NULL,
	[password] [nvarchar](255) NULL,
	[phone] [nvarchar](20) NULL,
	[ssn] [nvarchar](20) NULL,
	[university] [nvarchar](255) NULL,
	[user_agent] [nvarchar](255) NULL,
	[username] [nvarchar](50) NULL,
	[weight] [decimal](5, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
USE [master]
GO
ALTER DATABASE [Users] SET  READ_WRITE 
GO
